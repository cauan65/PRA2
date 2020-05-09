pacote com.example.pra2;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "toys")

    public class Toy{
	@PrimaryKey(autoGenerate = true)
	@NonNull
	@ColumnInfo(name = "toyId")
	private int tId;

	@ColumInfo (name = " toyName ")
	private String tName;

	private String tNickname;

	Toy público ( name string){
		tName = name;
	}

	public Toy (Name string , name Nickname, string createionDate){
		tName = Name;
		tNickname = Nickname;
		tStateOfUse = StateOfUse;
		tCreationDate = CreationDate;
	}

	public int getId(){
		return tId;
	}

	public void setId(int id){
		tId = id;
	}

	public void setName(Name string){
		tName = name;
	}

	public String getNickname(){
		return tNickname;
	}

	public int getStateOfUse(){
		return tStateOfUse;
	}

	public setStateOfUse(int StateOfUse){
		return tStateOfUse;
	}

	public String getCreationDate(){
		return mCreationDate;
	}

	public void setCreationDate (String creationDate){
		tCreationDate = creationDate;
	}

	private int tStateOfUse;
	private String tCreationDate;
}