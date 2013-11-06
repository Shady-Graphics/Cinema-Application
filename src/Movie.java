public class Movie {
    private String title;
    private int studio;
    private String classification;
    private String relDate;
    private String staring;
    private String duration;
    private String director;
    private String synopsis;
    private int screen;
    

    public Movie(String title, int studio, String classification, String relDate, String staring, String duration, String director, String synopsis, int screen) {
        this.title = title;
        this.studio = studio;
        this.classification = classification;
        this.relDate = relDate;
        this.staring = staring;
        this.duration = duration;
        this.director = director;
        this.synopsis = synopsis;
        this.screen = screen;
    }

    public Movie() {
    }

   
    

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the studio
     */
    public int getStudio() {
        return studio;
    }

    /**
     * @param studio the studio to set
     */
    public void setStudio(int studio) {
        this.studio = studio;
    }

    /**
     * @return the classification
     */
    public String getClassification() {
        return classification;
    }

    /**
     * @param classification the classification to set
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * @return the relDate
     */
    public String getRelDate() {
        return relDate;
    }

    /**
     * @param relDate the relDate to set
     */
    public void setRelDate(String relDate) {
        this.relDate = relDate;
    }

    /**
     * @return the staring
     */
    public String getStaring() {
        return staring;
    }

    /**
     * @param staring the staring to set
     */
    public void setStaring(String staring) {
        this.staring = staring;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the synopsis
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * @param synopsis the synopsis to set
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    /**
     * @return the screen
     */
    public int getScreen() {
        return screen;
    }

    /**
     * @param screen the screen to set
     */
    public void setScreen(int screen) {
        this.screen = screen;
    }

    

    


    public void getMovieDetails(){
        String output = "";
        
        output += this.getTitle()+"\n";
        output += this.getStudio()+"\n";
        output += this.getClassification()+"\n";
        output += this.getRelDate()+"\n";
        output += this.getStaring()+"\n";
        output += this.getDuration()+"\n";
        output += this.getDirector()+"\n";
        output += this.getSynopsis()+"\n";
        output += this.getScreen()+"\n";
        
        System.out.println(output);
    }
   

}
