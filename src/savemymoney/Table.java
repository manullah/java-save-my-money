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
    private String type;
    private String category;
    private int value;
    private String date;
    
    public Table(String type, String category, int value, String date) {
        this.type = type;
        this.category = category;
        this.value = value;
        this.date = date;
    }
    public String getType() {
        return type;
    }
    public String getCategory() {
        return category;
    }
    public int getValue() {
        return value;
    }
    public String getDate() {
        return date;
    }
}
