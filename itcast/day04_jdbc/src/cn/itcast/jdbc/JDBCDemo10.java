package cn.itcast.jdbc;

import cn.itcast.util.JDBCUtils;

import java.sql.*;

/**
 * 事务操作
 */
public class JDBCDemo10 {


    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;


        try {

            conn = JDBCUtils.getConnection();
            String sql1 = "update account set balance = balance - ? where id = ?";
            pstmt1 = conn.prepareStatement(sql1);
            pstmt1.setDouble(1, 500);
           // pstmt1.setInt(2, 1);


            ResultSet resultSet = pstmt1.executeQuery();
            while (resultSet.next()){
                System.out.println("");
            }


        } catch (Exception e) {
            //事务回滚
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
           // JDBCUtils.close(pstmt1, conn);
        }


    }

}
