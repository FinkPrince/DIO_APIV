package dio.budgeting.aplication.input;

import dio.budgeting.domain.Category;
import org.springframework.ai.tool.annotation.ToolParam;

public record PersistTransactionInput(@ToolParam(description = "Descricao para os gasto") String description,
                                      @ToolParam(description = "Preco para os gasto") Long amount,
                                      @ToolParam(description = "Categoria para os gasto") Category category) {


}
