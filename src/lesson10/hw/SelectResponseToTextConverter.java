package lesson10.hw;

import lesson10.hw.storage.Table;

/**
 * Переводит результат запроса select в текст
 */
public class SelectResponseToTextConverter {

	public String convert(Table table) {
		StringBuilder builder = new StringBuilder();
		table.getColumns().forEach(v -> builder.append(v.getName()).append(" "));
		builder.append("\n");
		table.getValues().forEach(
				v -> {
					v.forEach(curr -> builder.append(curr.getValue()).append(" "));
					builder.append("\n");
				}
		);
		return builder.toString();
	}
}
