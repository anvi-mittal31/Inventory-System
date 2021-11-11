package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.util.Objects;

public class modelTable {
    @FXML
    private SimpleStringProperty P_partNumber;
    @FXML
    private SimpleStringProperty P_refPartNumber;
    @FXML
    private SimpleStringProperty P_addOn;
    @FXML
    private SimpleIntegerProperty P_quantity;
    @FXML
    private SimpleStringProperty P_partFor;
    @FXML
    private SimpleStringProperty P_company;
    @FXML
    private SimpleStringProperty P_invDate;
    @FXML
    private SimpleStringProperty P_sourceOfPurchase;
    @FXML
    private SimpleStringProperty P_stockLocation;
    @FXML
    private SimpleStringProperty P_setOf;
    @FXML
    private SimpleStringProperty P_prefix;
    @FXML
    private SimpleStringProperty P_comment;

    @FXML
    private ImageView images;

    public ImageView getImages(){
        return this.images;
    }
    public void setImages(String URL){
        Image anImage = new Image(URL);
        this.images = new ImageView(anImage);
    }


    public String getP_partNumber() { return P_partNumber.get(); }
    public SimpleStringProperty p_partNumberProperty() {
        return P_partNumber;
    }
    public void setP_partNumber(String p_partNumber) {
        P_partNumber = new SimpleStringProperty(p_partNumber);
    }

    public String getP_refPartNumber() { return P_refPartNumber.get(); }
    public SimpleStringProperty p_refPartNumber() {
        return P_refPartNumber;
    }
    public void setP_refPartNumber(String p_refPartNumber) { P_refPartNumber = new SimpleStringProperty(p_refPartNumber); }

    public String getP_addOn() { return P_addOn.get(); }
    public SimpleStringProperty p_addOn() {
        return P_addOn;
    }
    public void setP_addOn(String p_addOn) {
        P_addOn = new SimpleStringProperty(p_addOn);
    }

    public Integer getP_quantity() { return P_quantity.get(); }
    public SimpleIntegerProperty p_quantity() {
        return P_quantity;
    }
    public void setP_quantity(Integer p_quantity) {
        P_quantity = new SimpleIntegerProperty(p_quantity);
    }

    public String getP_partFor() { return P_partFor.get(); }
    public SimpleStringProperty p_partFor() {
        return P_partFor;
    }
    public void setP_partFor(String p_partFor) {
        P_partFor = new SimpleStringProperty(p_partFor);
    }

    public String getP_company() { return P_company.get(); }
    public SimpleStringProperty p_company() {
        return P_company;
    }
    public void setP_company(String p_company) {
        P_company = new SimpleStringProperty(p_company);
    }

    public String getP_invDate() { return P_invDate.get(); }
    public SimpleStringProperty p_invDate() {
        return P_invDate;
    }
    public void setP_invDate(String p_invDate) {
        P_invDate = new SimpleStringProperty(p_invDate);
    }

    public String getP_sourceOfPurchase() { return P_sourceOfPurchase.get(); }
    public SimpleStringProperty p_sourceOfPurchase() {
        return P_sourceOfPurchase;
    }
    public void setP_sourceOfPurchase(String p_sourceOfPurchase) { P_sourceOfPurchase = new SimpleStringProperty(p_sourceOfPurchase); }

    public String getP_stockLocation() { return P_stockLocation.get(); }
    public SimpleStringProperty p_stockLocation() {
        return P_stockLocation;
    }
    public void setP_stockLocation(String p_stockLocation) { P_stockLocation = new SimpleStringProperty(p_stockLocation); }

    public String getP_setOf() { return P_setOf.get(); }
    public SimpleStringProperty p_setOf() {
        return P_setOf;
    }
    public void setP_setOf(String p_setOf) { P_setOf = new SimpleStringProperty(p_setOf); }

    public String getP_prefix() { return P_prefix.get(); }
    public SimpleStringProperty p_prefix() {
        return P_prefix;
    }
    public void setP_prefix(String p_prefix) { P_prefix = new SimpleStringProperty(p_prefix); }

    public String getP_comment() { return P_comment.get(); }
    public SimpleStringProperty p_comment() {
        return P_comment;
    }
    public void setP_comment(String p_comment) { P_comment = new SimpleStringProperty(p_comment); }


    public modelTable(String p_partNumber, String p_refPartNumber,String URL,String p_addOn, int p_quantity, String p_partFor, String p_company, String p_invDate,
                           String p_sourceOfPurchase, String p_stockLocation, String p_setOf, String p_prefix, String p_comment) {
        this.P_partNumber = new SimpleStringProperty(p_partNumber);
        this.P_refPartNumber = new SimpleStringProperty(p_refPartNumber);

        this.images = new ImageView(new Image(URL));
        images.setFitHeight(90);
        images.setFitWidth(150);
        this.P_addOn = new SimpleStringProperty(p_addOn);
        this.P_quantity = new SimpleIntegerProperty(p_quantity);
        this.P_partFor = new SimpleStringProperty(p_partFor);
        this.P_company = new SimpleStringProperty(p_company);
        this.P_invDate = new SimpleStringProperty(p_invDate);
        this.P_sourceOfPurchase = new SimpleStringProperty(p_sourceOfPurchase);
        this.P_stockLocation = new SimpleStringProperty(p_stockLocation);
        this.P_setOf = new SimpleStringProperty(p_setOf);
        this.P_prefix = new SimpleStringProperty(p_prefix);
        this.P_comment = new SimpleStringProperty(p_comment);
    }
}

