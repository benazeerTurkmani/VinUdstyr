package design.exam.Model;


public class Equipment {
    private String equipmentName;
    private int equipmentAge;
    private int priceFromNew;
    private String dependency;
    private String ownerComment;
    private boolean availableForLoan;
    private User currentHolder;

    public Equipment(String equipmentName, int equipmentAge, int priceFromNew, String dependency, String ownerComment, boolean availableForLoan, User currentHolder) {
        this.equipmentName = equipmentName;
        this.equipmentAge = equipmentAge;
        this.priceFromNew = priceFromNew;
        this.dependency = dependency;
        this.ownerComment = ownerComment;
        this.availableForLoan = availableForLoan;
        this.currentHolder = currentHolder;
    }

    public String getEquipmentName() { return equipmentName; }

    public void setEquipmentName(String equipmentName) { this.equipmentName = equipmentName; }

    public int getEquipmentAge() { return equipmentAge; }

    public void setEquipmentAge(int equipmentAge) { this.equipmentAge = equipmentAge; }

    public int getPriceFromNew() { return priceFromNew; }

    public void setPriceFromNew(int priceFromNew) { this.priceFromNew = priceFromNew; }

    public String getDependency() { return dependency; }

    public void setDependency(String dependency) { this.dependency = dependency; }

    public String getOwnerComment() { return ownerComment; }

    public void setOwnerComment(String ownerComment) { this.ownerComment = ownerComment; }

    public boolean isAvailableForLoan() { return availableForLoan; }

    public void setAvailableForLoan(boolean availableForLoan) { this.availableForLoan = availableForLoan; }

    public User getCurrentHolder() { return currentHolder; }

    public void setCurrentHolder(User currentHolder) { this.currentHolder = currentHolder; }
}
