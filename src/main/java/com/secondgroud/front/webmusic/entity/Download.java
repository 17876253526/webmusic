package entity;

import java.util.Date;

public class Download {
    private Integer downloadId;

    private Integer downloadUser;

    private Integer downloadSong;

    private Date downloadTime;

    public Integer getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(Integer downloadId) {
        this.downloadId = downloadId;
    }

    public Integer getDownloadUser() {
        return downloadUser;
    }

    public void setDownloadUser(Integer downloadUser) {
        this.downloadUser = downloadUser;
    }

    public Integer getDownloadSong() {
        return downloadSong;
    }

    public void setDownloadSong(Integer downloadSong) {
        this.downloadSong = downloadSong;
    }

    public Date getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(Date downloadTime) {
        this.downloadTime = downloadTime;
    }
}