package com.mashiibing.jvm.orm.first;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserEntity_Helper {

    public UserEntity create(ResultSet rs) throws SQLException {
        UserEntity ue = new UserEntity();

        ue._userId = rs.getInt("user_id");
        ue._userName = rs.getString("user_name");
        ue._password = rs.getString("password");
        return ue;
    }

}
