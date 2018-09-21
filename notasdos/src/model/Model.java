/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Dani
 */
public class Model {
    private String message;
   private String Path;

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void readFile(String path){
        try{
            String row;
            String d="";
            try (FileReader file = new FileReader(path)){
                BufferedReader bufferedReader = new BufferedReader(file);
                while((row = bufferedReader.readLine()) != null){
                    d=d+row+"\n";
                    System.out.println(row);
                } 
                this.setMessage(d);
                bufferedReader.close();
            }
            }catch(FileNotFoundException err){
                System.out.println("Error! "+err.getMessage());   
            }catch(IOException err){
                System.out.println("Error! "+err.getMessage());
        }
    }
    
    public void writeFile(String path, String message){
        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file, true);
            try(PrintWriter printWriter = new PrintWriter(fileWriter)){
                printWriter.println(message);
                printWriter.close();
            }        
        }catch(FileNotFoundException err){
           System.out.println("Esta causando un error" +err.getMessage());
        }catch(IOException err){
            System.err.println("error "+err.getMessage());
        }
    }
}
