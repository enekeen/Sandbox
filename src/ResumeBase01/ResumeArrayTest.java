package ResumeBase01;

// realize save and print not null



public class ResumeArrayTest {
    public static void main(String[] args) {
        ResumeArray resumeArrayOne = new ResumeArray();
        resumeArrayOne.save();
        resumeArrayOne.get(0);
        resumeArrayOne.getAll();
        resumeArrayOne.delete();
    }
}
