package com.bridgelabz.jdbc;

import org.junit.Test;

import java.sql.SQLException;

public class AddressBookServiceTest {

    @Test
    public void addressBook_GetConnection() throws SQLException {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.getConnection();
    }
}
