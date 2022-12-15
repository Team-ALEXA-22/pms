package pms;
import java.sql.ResultSet;

public class prs_technical extends dbclass {
public String id;
public String usercode;
public String type;
public String description; 
public String create_prs_technical()
 {
    String query="INSERT INTO `prs_technical`(`usercode`, `type`, `description`) VALUES ('"+ usercode +"','"+ type +"','"+ description +"')";
    String message=super.tableinsertupdatedelete(query);
    return message;
 }
 public String update_prs_technical()
 {
    String query="UPDATE `prs_technical` SET `usercode`='"+ usercode +"',`type`='"+ type +"',`description`='"+ description +"' WHERE id='"+ id+"'";
    String message=super.tableinsertupdatedelete(query);
    return message;
 }
 public ResultSet retriveall_prs_technical()
{
    return super.getfromtable("select * from prs_technical");
}
 public ResultSet retrivewithid_prs_technical()
{
    return super.getfromtable("select * from prs_technical  WHERE id='"+ id +"'");
}
 public String delete_prs_technical()
 {
    String query="delete from prs_technical WHERE id='"+ id +"'";
    String message=super.tableinsertupdatedelete(query);
    return message;
 }
}