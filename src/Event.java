import java.util.HashSet;
import java.util.Objects;

public class Event {

    private String title;
    private String date;
    private String description;
    HashSet<Person> people;

    public Event(String title, String date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
        people = new HashSet<Person>();
    }

    public Event(String title) {
        this.title = title;
        this.date = "";
        this.description = "";
        people = new HashSet<Person>();
    }

    public Event(String title, String date) {
        this.title = title;
        this.date = date;
        this.description = "";
        people = new HashSet<Person>();
    }

    public Event(Event e){
        this.title = e.getTitle();
        this.date = e.getDate();
        this.description = e.getDescription();
    }

    public Event clone() throws CloneNotSupportedException {
        return (Event) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return Objects.equals(getTitle(), event.getTitle()) &&
                Objects.equals(getDate(), event.getDate()) &&
                Objects.equals(getDescription(), event.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDate(), getDescription());
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.getTitle() + " is a " + this.getDescription() + " and will be held at " + this.getDate() + ".";
    }

    public void addPerson(Person prs) {
        if(!people.contains(prs))
            this.people.add(prs);
    }

    public int getAudienceCount() {
        /*int count = 0;
        for (Person prs : people) {
            if (prs.getClass().getName() == "Attendee")
                count++;
        }
        return count;*/
        return people.size();
    }
}
