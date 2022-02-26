package lesson10.hw.test;

import lesson10.hw.*;
import lesson10.hw.request.CreateRequest;
import lesson10.hw.request.DeleteRequest;
import lesson10.hw.request.InsertRequest;
import lesson10.hw.request.SelectRequest;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class RequestParserTest {

	private final RequestParser parser = new RequestParser(new RequestParserFactory());

	@Test
	public void createRequest() {
		CreateRequest request = (CreateRequest) parser.parse("create table table_name(id numeric, param1 varchar, boolParam boolean)");
		assertEquals("table_name", request.getTableName());
		List<Column> column = request.getColumn();
		assertEquals(3, column.size());
		Column id = column.get(0);
		assertEquals(ColumnType.NUMERIC, id.getType());
		assertEquals("id", id.getName());

		Column param1 = column.get(1);
		assertEquals(ColumnType.VARCHAR, param1.getType());
		assertEquals("param1", param1.getName());

		Column boolParam = column.get(2);
		assertEquals(ColumnType.BOOLEAN, boolParam.getType());
		assertEquals("boolParam", boolParam.getName());
	}

	@Test
	public void insertRequest() {
		InsertRequest request = (InsertRequest) parser.parse("insert into table_name('value1', 123, true)");
		assertEquals("table_name", request.getTableName());
		List<ColumnValue> columnValues = request.getValues();
		assertEquals(3, columnValues.size());

		ColumnValue strValue = columnValues.get(0);
		assertEquals(ColumnType.VARCHAR, strValue.getType());
		assertEquals("value1", strValue.getValue());

		ColumnValue numericValue = columnValues.get(1);
		assertEquals(ColumnType.NUMERIC, numericValue.getType());
		assertEquals(new BigDecimal(123), numericValue.getValue());

		ColumnValue boolValue = columnValues.get(2);
		assertEquals(ColumnType.BOOLEAN, boolValue.getType());
		assertEquals(true, boolValue.getValue());
	}

	@Test
	public void deleteRequestWithExpression() {
		DeleteRequest request = (DeleteRequest) parser.parse("delete from table_name where column1=value1");
		assertEquals("table_name", request.getTableName());
		WhereExpression expression = request.getExpression();
		assertEquals("column1", expression.getColumnName());
		assertEquals("value1", expression.getValue());
	}

	@Test
	public void deleteRequestWithoutExpression() {
		DeleteRequest request = (DeleteRequest) parser.parse("delete from table_name");
		assertEquals("table_name", request.getTableName());
		assertNull(request.getExpression());
	}

	@Test
	public void selectRequestWithExpression() {
		SelectRequest request = (SelectRequest) parser.parse("select * from table_name where column1=value1");
		assertEquals("table_name", request.getTableName());
		WhereExpression expression = request.getExpression();
		assertEquals("column1", expression.getColumnName());
		assertEquals("value1", expression.getValue());
	}

	@Test
	public void selectRequestWithoutExpression() {
		SelectRequest request = (SelectRequest) parser.parse("select * from table_name");
		assertEquals("table_name", request.getTableName());
		assertNull(request.getExpression());
	}
}
