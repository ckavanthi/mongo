package generics;
import java.util.HashSet;
import java.util.Objects;
class Employe
{
	int Id;
	String Name;
	int Salary;
	String Department;
	public  Employe(int id, String name, int salary, String department) 
	{
		Id = id;
		Name = name;
		Salary = salary;
		Department = department;
	}
	public int hashCode()
	{
		return Objects.hash(Id);
	}
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return Id == other.Id;
	}
	public String toString() 
	  {
		return "Employe [id="+Id+",Name=" + Name + ", Salary=" + Salary + ", Department=" + Department + "]";
      }
}
	public class q1 
	{
	public static void main(String[] args) 
	{
		HashSet<Employe> ob = new HashSet<Employe>();
		ob.add(new Employe(1,"Avi",250000,"AERO"));
		ob.add(new Employe(2,"Achu",210000,"MECH"));
		ob.add(new Employe(3,"Sidhu",150000,"MECH"));
		ob.add(new Employe(4,"pavi",50000,"BIO"));
		ob.add(new Employe(2,"ck",32103,"BIO"));
		for (Employe a : ob)
		{
			System.out.println(a);
	    }
	}
}
 

