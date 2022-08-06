package vn.com.duy.exportmanagement.controller;

import org.springframework.web.bind.annotation.*;
import vn.com.duy.exportmanagement.dao.DaiLiDao;
import vn.com.duy.exportmanagement.model.DaiLi;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {
    private final DaiLiDao daiLiDao = new DaiLiDao();

    @GetMapping
    public List<DaiLi> layDanhSach() throws SQLException {
        List<DaiLi> dsdl = daiLiDao.layDanhSach(null);
        dsdl.forEach(System.out::println);
        return dsdl;
    }

    @GetMapping("/{tuKhoa}")
    public List<DaiLi> timKiem(@PathVariable("tuKhoa") String tuKhoa) throws SQLException {
        List<DaiLi> dsdl = daiLiDao.layDanhSach(tuKhoa);
        dsdl.forEach(System.out::println);
        return dsdl;
    }

    @PostMapping
    public void tao(@RequestBody DaiLi daiLi) throws SQLException {
        daiLiDao.tao(daiLi);
        System.out.println("Tao dai ly thanh cong!");
    }
}
