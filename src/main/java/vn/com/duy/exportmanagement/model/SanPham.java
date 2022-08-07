package vn.com.duy.exportmanagement.model;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SanPham {
    private Integer maSP;
    private String tenSP;
    private Integer soluongtonkho;
    private NhaCungCap nhaCungCap;

}
