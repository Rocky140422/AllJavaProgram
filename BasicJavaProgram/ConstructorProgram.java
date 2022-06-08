package BasicJavaProgram;

public class ConstructorProgram {
		//data	member
		int	id;
		String	name;
		char	grade;
		double	salary;
		boolean	value; //true/false
		public	ConstructorProgram() //initalse	data	member	of	class
		{
		id	=	11;
		name	=	"Iron	man";
		grade	=	'A';
		salary	=	10000.0;
		value	=	true;
		}
		public	void	output()
		{
		System.out.println("ID	=	"	+	id);
		System.out.println("Name	=	"	+	name);
		System.out.println("Grade	=	"	+	grade);
		System.out.println("Salary	=	"	+	salary);
		System.out.println("Boolean	Value	=	"	+	value);
		}
		public	static	void	main(String[]	args)	{
			ConstructorProgram	x	=	new	ConstructorProgram();
		// method_name();
		x.output();
		}
		}


