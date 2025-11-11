/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nas27
 */
public class User {
    private String nama;
    private String email;
    private String username;
    private String password;

    public User(String nama, String email, String username, String password) {
        this.nama = nama;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    // Getter & Setter sederhana
    public String getNama() { return nama; }
    public String getEmail() { return email; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}
