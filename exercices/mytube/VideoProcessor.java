package exercices.mytube;

public class VideoProcessor {

    private Encoder encoder;
    private DataBase dataBase;
    private Notif notif;

    public VideoProcessor(Encoder encoder, DataBase dataBase, Notif notif) {
        this.encoder = encoder;
        this.dataBase = dataBase;
        this.notif = notif;
    }

    public void process(Video video) {
        encoder.encode(video);
        dataBase.store(video);
        notif.sendNotification(video.getUser());

    }
}

