package exercices.mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        //utilise les classe qui on implementé les interfaces
        var enco = new VideoEncoder();
        var data = new VideoDatabase();
        var not = new EmailService();

        var processor = new VideoProcessor(enco, data, not);
        processor.process(video);
    }
}
