package entity;

import java.util.Date;

public class LastSong {
    private Integer lastSongId;

    private Integer lastSongUser;

    private Integer lastSongSong;

    private Date playTime;

    public Integer getLastSongId() {
        return lastSongId;
    }

    public void setLastSongId(Integer lastSongId) {
        this.lastSongId = lastSongId;
    }

    public Integer getLastSongUser() {
        return lastSongUser;
    }

    public void setLastSongUser(Integer lastSongUser) {
        this.lastSongUser = lastSongUser;
    }

    public Integer getLastSongSong() {
        return lastSongSong;
    }

    public void setLastSongSong(Integer lastSongSong) {
        this.lastSongSong = lastSongSong;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }
}