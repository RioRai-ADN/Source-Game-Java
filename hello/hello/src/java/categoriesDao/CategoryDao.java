/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categoriesDao;

import connect.sqlServerConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Categories;

/**
 *
 * @author Rio.Rai
 */
public class CategoryDao {
    
    public ArrayList getCategories() throws SQLException {
    
        Connection cnn = sqlServerConnection.getConnect();
        String sql = "select * from CATEGORIES";
        
        PreparedStatement ps = cnn.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        
        ArrayList<Categories> list = new ArrayList<>();
        while(rs.next()) {
        
            Categories cat = new Categories();
            
            cat.setCatID(rs.getInt("categoryID"));
            cat.setCatName(rs.getString("categoryName"));
            cat.setCatDescription(rs.getString("description"));
            cat.setCatPicture(rs.getString("picture"));
            
            list.add(cat);
        }
        
        return list;
    }
}
