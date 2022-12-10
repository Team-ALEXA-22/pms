package pms;
import java.sql.ResultSet;

/**
 *
 * @author ABINESH JAIN A J
 */
public class prs_coresprofobj extends dbclass {
public String id;
public String usercode;
public String correspondence;
public String profile; 
public String objective; 
public String create_prs_coresprofobj()
 {
    String query="INSERT INTO `prs_coresprofobj`(`usercode`, `correspondence`, `profile`, `objective`) VALUES ('"+ usercode +"','"+ correspondence +"','"+ profile +"','"+ objective +"')";
    String message=super.tableinsertupdatedelete(query);
    return message;
 }
 public String update_prs_coresprofobj()
 {
    String query="UPDATE `usersetting` SET `usercode`='"+ usercode +"',`correspondence`='"+ correspondence +"',`profile`='"+ profile +"',`objective`='"+ objective +"' WHERE id='"+ id+"'";
    String message=super.tableinsertupdatedelete(query);
    return message;
 }
 public ResultSet retriveall_prs_coresprofobj()
{
    return super.getfromtable("select * from prs_coresprofobj");
}
 public ResultSet retrivewithid_prs_coresprofobj()
{
    return super.getfromtable("select * from usersetting  WHERE id='"+ id +"'");
}
 public String delete_prs_coresprofobj()
 {
    String query="delete from usersetting WHERE id='"+ id +"'";
    String message=super.tableinsertupdatedelete(query);
    return message;
 }
}
