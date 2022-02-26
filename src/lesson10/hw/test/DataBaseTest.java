package lesson10.hw.test;

import lesson10.hw.*;
import lesson10.hw.storage.Table;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class DataBaseTest {

	@Test
	public void create() {
		DataBase dataBase = new DataBase();
		RequestResult crateTable1Result = dataBase.execute("create table table1(id numeric, param1 varchar, boolParam boolean)");
		assertEquals(RequestResult.SUCCESS, crateTable1Result);

		RequestResult crateTable2Result = dataBase.execute("create table table2(id numeric, id1 numeric, param varchar, param1 varchar, boolParam boolean, boolParam1 boolean)");
		assertEquals(RequestResult.SUCCESS, crateTable2Result);
	}

	@Test
	public void createException() {
		DataBase dataBase = new DataBase();
		RequestResult crateTable1Result = dataBase.execute("create table table1(id numeric, param1 boolParam boolean)");
		assertFalse(crateTable1Result.isSuccess());
		assertEquals("No enum constant lesson10.hw.ColumnType.BOOLPARAM", crateTable1Result.getMessage());

		RequestResult crateTable2Result = dataBase.execute("create table table2(id numeric, param1 varchar, param1 varchar, boolParam boolean)");
		assertFalse(crateTable2Result.isSuccess());
		assertEquals("Столбец с именем 'param1' уже существует", crateTable2Result.getMessage());

		dataBase.execute("create table table2(id numeric, param1 varchar, boolParam boolean)");
		RequestResult crateTable3Result = dataBase.execute("create table table2(id numeric, param1 varchar, boolParam boolean)");
		assertFalse(crateTable3Result.isSuccess());
		assertEquals("Таблица с именем 'table2' уже существует", crateTable3Result.getMessage());
	}

	@Test
	public void insert() {
		DataBase dataBase = new DataBase();
		dataBase.execute("create table table1(id numeric, param1 varchar, boolParam boolean)");
		dataBase.execute("create table table2(id numeric, id1 numeric, param varchar, param1 varchar, boolParam boolean, boolParam1 boolean)");

		RequestResult insertResult = dataBase.execute("insert into table1(123, 'value1', true)");
		assertEquals(RequestResult.SUCCESS, insertResult);

		RequestResult insert2Result = dataBase.execute("insert into table2(123, 321, 'value1', 'value2', true, false)");
		assertEquals(RequestResult.SUCCESS, insert2Result);
	}

	@Test
	public void insertException() {
		DataBase dataBase = new DataBase();
		dataBase.execute("create table table1(id numeric, param1 varchar, boolParam boolean)");
		dataBase.execute("create table table2(id numeric, id1 numeric, param varchar, param1 varchar, boolParam boolean, boolParam1 boolean)");

		RequestResult insertResult = dataBase.execute("insert into table3(123, 'value1', true)");
		assertFalse(insertResult.isSuccess());
		assertEquals("Таблицы 'table3' не существует", insertResult.getMessage());

		RequestResult insert1Result = dataBase.execute("insert into table1('value1')");
		assertFalse(insert1Result.isSuccess());
		assertEquals("Передан неправильный набор аргументов", insert1Result.getMessage());

		RequestResult insert2Result = dataBase.execute("insert into table1('value1', 123, true)");
		assertFalse(insert2Result.isSuccess());
		assertEquals("Неверная последовательность параметров", insert2Result.getMessage());

		RequestResult insert3Result = dataBase.execute("insert into table3(123.x, 'value1', true)");
		assertFalse(insert3Result.isSuccess());
		assertEquals("Неверный формат данных", insert3Result.getMessage());
	}

	@Test
	public void select() {
		DataBase dataBase = new DataBase();
		dataBase.execute("create table table1(id numeric, param1 varchar, boolParam boolean)");
		dataBase.execute("insert into table1(123, 'value1', true)");
		dataBase.execute("insert into table1(32, 'value2', false)");

		dataBase.execute("create table table2(id numeric, id1 numeric, param varchar, param1 varchar, boolParam boolean, boolParam1 boolean)");
		dataBase.execute("insert into table2(33, -7, 'value1', 'value21', true, false)");
		dataBase.execute("insert into table2(null, 33, 'value2', 'value22', false, true)");
		dataBase.execute("insert into table2(33, null, 'value2', 'value23', true, false)");

		RequestResult select1Result = dataBase.execute("select * from table1");
		assertTrue(select1Result.isSuccess());
		String selectTextResult = new SelectResponseToTextConverter().convert(select1Result.getTable());
		assertEquals("id param1 boolParam \n123 value1 true \n32 value2 false \n", selectTextResult);

		Table table = select1Result.getTable();

		List<Column> columns = table.getColumns();
		assertEquals(3, columns.size());
		assertEquals("id", columns.get(0).getName());
		assertEquals(ColumnType.NUMERIC, columns.get(0).getType());
		assertEquals("param1", columns.get(1).getName());
		assertEquals(ColumnType.VARCHAR, columns.get(1).getType());
		assertEquals("boolParam", columns.get(2).getName());
		assertEquals(ColumnType.BOOLEAN, columns.get(2).getType());

		List<List<ColumnValue>> values = table.getValues();
		assertEquals(2, values.size());
		List<ColumnValue> columnValues1 = values.get(0);
		assertEquals(ColumnType.NUMERIC, columnValues1.get(0).getType());
		assertEquals(new BigDecimal(123), columnValues1.get(0).getValue());
		assertEquals(ColumnType.VARCHAR, columnValues1.get(1).getType());
		assertEquals("value1", columnValues1.get(1).getValue());
		assertEquals(ColumnType.BOOLEAN, columnValues1.get(2).getType());
		assertEquals(true, columnValues1.get(2).getValue());

		List<ColumnValue> columnValues2 = values.get(1);
		assertEquals(ColumnType.NUMERIC, columnValues2.get(0).getType());
		assertEquals(new BigDecimal(32), columnValues2.get(0).getValue());
		assertEquals(ColumnType.VARCHAR, columnValues2.get(1).getType());
		assertEquals("value2", columnValues2.get(1).getValue());
		assertEquals(ColumnType.BOOLEAN, columnValues2.get(2).getType());
		assertEquals(false, columnValues2.get(2).getValue());

		RequestResult select2Result = dataBase.execute("select * from table2 where param='value2'");
		assertTrue(select2Result.isSuccess());
		String selectText1Result = new SelectResponseToTextConverter().convert(select2Result.getTable());
		assertEquals("id id1 param param1 boolParam boolParam1 \nnull 33 value2 value22 false true \n33 null value2 value23 true false \n", selectText1Result);
	}

	@Test
	public void selectException() {
		DataBase dataBase = new DataBase();
		dataBase.execute("create table table1(id numeric, param1 varchar, boolParam boolean)");
		dataBase.execute("insert into table1(123, 'value1', true)");
		dataBase.execute("insert into table1(32, 'value2', false)");

		dataBase.execute("create table table2(id numeric, id1 numeric, param varchar, param1 varchar, boolParam boolean, boolParam1 boolean)");
		dataBase.execute("insert into table2(33, -7, 'value1', 'value21', true, false)");
		dataBase.execute("insert into table2(null, 33, 'value2', 'value22', false, true)");
		dataBase.execute("insert into table2(33, null, 'value2', 'value23', true, false)");

		RequestResult select1Result = dataBase.execute("select * from table3");
		assertFalse(select1Result.isSuccess());
		assertEquals("Таблицы 'table3' не существует", select1Result.getMessage());

		RequestResult select2Result = dataBase.execute("select * from table2 where param123=null");
		assertFalse(select2Result.isSuccess());
		assertEquals("Столбец с именем 'param123' не существует", select2Result.getMessage());
	}

	@Test
	public void delete() {
		DataBase dataBase = new DataBase();
		dataBase.execute("create table table1(id numeric, param1 varchar, boolParam boolean)");
		dataBase.execute("insert into table1(123, 'value1', false)");
		dataBase.execute("insert into table1(32, 'value2', true)");
		dataBase.execute("insert into table1(323, 'value1', false)");

		RequestResult select1Result = dataBase.execute("select * from table1");
		assertTrue(select1Result.isSuccess());
		String selectText1Result = new SelectResponseToTextConverter().convert(select1Result.getTable());
		assertEquals("id param1 boolParam \n123 value1 false \n32 value2 true \n323 value1 false \n", selectText1Result);

		RequestResult delete1Result = dataBase.execute("delete from table1");
		assertEquals(RequestResult.SUCCESS, delete1Result);

		RequestResult select2Result = dataBase.execute("select * from table1");
		assertTrue(select2Result.isSuccess());
		String selectText2Result = new SelectResponseToTextConverter().convert(select2Result.getTable());
		assertEquals("id param1 boolParam \n", selectText2Result);

		dataBase.execute("insert into table1(123, 'value1', false)");
		dataBase.execute("insert into table1(32, 'value2', true)");
		dataBase.execute("insert into table1(323, 'value1', false)");

		RequestResult delete2Result = dataBase.execute("delete from table1 where boolParam=false");
		assertEquals(RequestResult.SUCCESS, delete2Result);

		RequestResult select3Result = dataBase.execute("select * from table1");
		assertTrue(select3Result.isSuccess());
		String selectText3Result = new SelectResponseToTextConverter().convert(select3Result.getTable());
		assertEquals("id param1 boolParam \n32 value2 true \n", selectText3Result);
	}

	@Test
	public void deleteException() {
		DataBase dataBase = new DataBase();
		dataBase.execute("create table table1(id numeric, param1 varchar, boolParam boolean)");

		RequestResult delete1Result = dataBase.execute("delete from table3");
		assertFalse(delete1Result.isSuccess());
		assertEquals("Таблицы 'table3' не существует", delete1Result.getMessage());

		RequestResult delete2Result = dataBase.execute("delete from table1 where param123=null");
		assertFalse(delete2Result.isSuccess());
		assertEquals("Столбец с именем 'param123' не существует", delete2Result.getMessage());
	}
}
