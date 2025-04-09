package As1_Network;

import java.util.ArrayList;

public class Message {
    private String machineType;
    private String machineId;
    private String warning;


    public Message(String message){
        String str1 = message.substring(0, message.indexOf(':') );
        String str2 = message.substring( message.indexOf(':')+1 );

        machineType = str1.substring(0, str1.length()-1);
        machineId = str1.substring( str1.length()-1 );
        warning = str2.trim();

    }//constructor

    public String getMachineType() {
        return machineType;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getWarning() {
        return warning;
    }

    public boolean scanWarning( String keyword){
        if( warning.equals(keyword) ){
            return true;
        }else if( warning.endsWith( " " + keyword)){
            return true;
        }else if( warning.startsWith( keyword + " ")){
            return true;
        }else if( warning.contains( " " + keyword + " ")){
            return true;
        }else {
            return false;
        }
    }//scan warning


}//class