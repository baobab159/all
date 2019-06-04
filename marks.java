import java.util.Scanner;
public class obiektowe
{
	static int NumberOfSubjects;
	int NumberOfMarks, subject, sum=0, fullsum=0, mark;
	
	public static void main(String args[])
	{
		System.out.print("Ile przedmiotów?");
		Scanner NumberOfSubjectsscanner=new Scanner(System.in);
		NumberOfSubjects=NumberOfSubjectsscanner.nextInt();
		obiektowe wywołanie=new obiektowe();
		wywołanie.getMarks();
		wywołanie.SubjectAverage(NumberOfSubjectsscanner, ); //co tutaj wpisać?
		wywołanie.FullAverage(NumberOfSubjects);
	}
	
	int[][] marks=new int[NumberOfSubjects-1][NumberOfMarks-1];
	
	void getMarks()
	{
		
		System.out.println("Ile ocen?");
		Scanner NumberOfMarksscanner=new Scanner(System.in);
		NumberOfMarks=NumberOfMarksscanner.nextInt();
		Scanner marksscanner=new Scanner(System.in);
		System.out.println("Wpisuj");
		for(int Subject=0; Subject<NumberOfMarks; Subject++)
			for(int MarkIndex = 0; MarkIndex<NumberOfMarks; MarkIndex++)
				if(marks[Subject][MarkIndex]<7 && marks[Subject][MarkIndex]>0)
					marks[Subject][MarkIndex] = marksscanner.nextInt();
					else while(!(marks[Subject][MarkIndex]<7 && marks[Subject][MarkIndex]>0))
						marks[Subject][MarkIndex] = marksscanner.nextInt();
	}
	
	double SubjectAverage(int Subject, int NumberOfMarks)
	{
		for(Subject=0; Subject<NumberOfSubjects; Subject++)
			for(mark=0; mark<NumberOfMarks; mark++)
				sum+=marks[subject][mark];
		return sum/NumberOfMarks;
	}
	
	double FullAverage(int NumberOfSubjects)
	{
		for(int subject=0; subject<NumberOfSubjects; subject++)
			fullsum+=SubjectAverage(subject, NumberOfMarks);
		return fullsum/NumberOfSubjects;
	}
}
