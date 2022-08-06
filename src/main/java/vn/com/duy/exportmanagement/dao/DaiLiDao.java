package vn.com.duy.exportmanagement.dao;

import vn.com.duy.exportmanagement.model.DaiLi;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaiLiDao extends Dao {

    public List<DaiLi> layDanhSach(String tuKhoa) throws SQLException {
        List<DaiLi> dsdl = new ArrayList<>();
        PreparedStatement ps;
        ResultSet resultSet;
        if (tuKhoa == null || tuKhoa.isEmpty()) {
            String sql = "select * from daili";
            ps = connection.prepareStatement(sql);
        } else {
            String sql = "select * from daili where tenDL like CONCAT('%',?,'%')";
            ps = connection.prepareStatement(sql);
            ps.setString(1, tuKhoa);
        }
        resultSet = ps.executeQuery();
        while (resultSet.next()) {
            DaiLi daiLi = new DaiLi();
            daiLi.setMaDL(resultSet.getInt("idDL"));
            daiLi.setTenDL(resultSet.getString("tenDL"));
            daiLi.setSdt(resultSet.getString("sdt"));
            daiLi.setDiaChi(resultSet.getString("diaChi"));
            dsdl.add(daiLi);
        }
        return dsdl;
    }

    public void tao(DaiLi daiLi) throws SQLException {
        String sql = "insert into daili(tenDL,sdt,diaChi)  "
                + "values(?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, daiLi.getTenDL());
        ps.setString(2, daiLi.getSdt());
        ps.setString(3, daiLi.getDiaChi());
        ps.executeUpdate();
    }
}
