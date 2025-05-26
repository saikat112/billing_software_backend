package billing.billingsoftware.io;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
@Builder
@Data
public class CategoryResponse {
    private String categoryId;
    private String name;
    private String description;
    private String bgColor;
    private String imgUrl;
    private Timestamp createdAt;
    private Timestamp updateAt;
}
