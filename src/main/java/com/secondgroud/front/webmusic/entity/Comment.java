package entity;

import java.util.Date;

public class Comment {
    private Integer commentId;

    private Date commentTime;

    private Integer commentUser;

    private Integer commentCommentIncrease;

    private Integer replyId;

    private Integer commentLikeIncrease;

    private String commentContent;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Integer getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(Integer commentUser) {
        this.commentUser = commentUser;
    }

    public Integer getCommentCommentIncrease() {
        return commentCommentIncrease;
    }

    public void setCommentCommentIncrease(Integer commentCommentIncrease) {
        this.commentCommentIncrease = commentCommentIncrease;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getCommentLikeIncrease() {
        return commentLikeIncrease;
    }

    public void setCommentLikeIncrease(Integer commentLikeIncrease) {
        this.commentLikeIncrease = commentLikeIncrease;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}