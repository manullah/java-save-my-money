/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savemymoney;

/**
 *
 * @author Symp
 */
public class Table {
    private int id;
    private String type;
    private int value;
    private String date;
    
    public Table(int id, String type, int value, String date) {
        this.id = id;
        this.type = type;
        this.value = value;
        this.date = date;
    }
    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public int getValue() {
        return value;
    }
    public String getDate() {
        return date;
    }
}
