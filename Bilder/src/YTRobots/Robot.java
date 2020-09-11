package YTRobots;

/**
 * Created by PZON_SM on 07.09.2020.
 **/
public class Robot implements RobotPlan {
    private String head;
    private String body;
    private String arms;
    private String legs;

    @Override
    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void setArms(String arms) {
        this.arms = arms;
    }

    @Override
    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getHead() {
        return head;
    }

    public String getBody() {
        return body;
    }

    public String getArms() {
        return arms;
    }

    public String getLegs() {
        return legs;
    }
}
