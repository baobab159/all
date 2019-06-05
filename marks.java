import java.util.Scanner;
public class SchoolMarks
{
	static int numberOfSubjects;
	int numberOfMarks, subject, sum=0, fullsum=0, mark;
	
	public static void main(String args[])	{
		SchoolMarks firstYear=new SchoolMarks();
		firstYear.getMarks();
		firstYear.SubjectAverage(numberOfSubjects,  );
		firstYear.FullAverage(numberOfSubjects);
	}
	
	int[][] marks=new int[numberOfSubjects-1][numberOfMarks-1];
	
	void getMarks(){
		System.out.print("Ile przedmiotów?");
		Scanner numberOfSubjectsScanner=new Scanner(System.in);
		numberOfSubjects =numberOfSubjectsScanner.nextInt();
		System.out.println("Ile ocen?");
		Scanner numberOfMarksscanner = new Scanner(System.in);
		numberOfMarks = numberOfMarksscanner.nextInt();
		Scanner marksScanner = new Scanner(System.in);
		System.out.println("Wpisuj");
		for(int subject = 0; subject<numberOfMarks; subject++){
			for(int markIndex = 0; markIndex<numberOfMarks; markIndex++){
				if(marks[subject][markIndex]<7 && marks[subject][markIndex]>0){
					marks[subject][markIndex] = marksScanner.nextInt();
				} else{
					while(! (marks[subject][markIndex]<7 && marks[subject][markIndex]>0)){
						marks[subject][markIndex] = marksScanner.nextInt();
					}
				}
			}
		}
	}
	
	double SubjectAverage(int subject, int numberOfMarks){
		for(subject=0; subject<numberOfSubjects; subject++){
			for(mark = 0; mark<numberOfMarks; mark++){
				sum += marks[subject][mark];
			}
		}
		return sum/numberOfMarks;
	}
	
	double FullAverage(int numberOfSubjects){
		for(int subject=0; subject<numberOfSubjects; subject++)	{
			fullsum += SubjectAverage(subject, numberOfMarks);
		}
		return fullsum/numberOfSubjects;
	}
}
