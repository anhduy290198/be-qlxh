package vn.com.duy.exportmanagement.model;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class NhaCungCap {
    private Integer maNCC;
    private String tenNCC;
    private String sdt;
    private DiaChi diaChi;
}
