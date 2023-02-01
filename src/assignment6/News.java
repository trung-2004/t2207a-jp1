package assignment6;

public class News implements INews{
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;

    public int[] RateList = new int[3];


    public int getID() {
        return ID;
    }

    public News setID(int ID) {
        this.ID = ID;
        return this;
    }

    public String getTitle() {
        return Title;
    }

    public News setTitle(String title) {
        Title = title;
        return this;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public News setPublishDate(String publishDate) {
        PublishDate = publishDate;
        return this;
    }

    public String getAuthor() {
        return Author;
    }

    public News setAuthor(String author) {
        Author = author;
        return this;
    }

    public String getContent() {
        return Content;
    }

    public News setContent(String content) {
        Content = content;
        return this;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("Publish Date: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("Average Rate: " + AverageRate);
    }


    public void Calculate() {
        int sum = 0;
        for (int i = 0; i < RateList.length; i++) {
            sum += RateList[i];
        }
        System.out.println(sum);
        AverageRate = (float) sum / RateList.length;

    }
}
