public class StudentRecordExample {
    public static void main(String[] args) {
//        membuat 3 object StudentRecord
        StudentRecord annaRecord = new StudentRecord("Anna");
        StudentRecord beahRecord = new StudentRecord("Beah","Philippines");
        StudentRecord crisRecord = new StudentRecord(80,90,100);

//        memberi nama siswa
//        annaRecord.setName("Anna");
        annaRecord.setAddress("Philippines");
        annaRecord.setAge(15);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishGrade(95.5);
        annaRecord.setScienceGrade(100);

//        overloading methods
        annaRecord.print( annaRecord.getName() );
        annaRecord.print( annaRecord.getEnglishGrade(), annaRecord.getMathGrade(), annaRecord.getScienceGrade());

//        beahRecord.setName("Beah");
//        crisRecord.setName("Cris");

//        menampilkan nama siswa "Anna"
        System.out.println(annaRecord.getName());

//        menampilkan jumlah siswa
        System.out.println("Count=" + StudentRecord.getStudentCount());
    }
}
