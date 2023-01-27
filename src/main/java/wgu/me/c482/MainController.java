package wgu.me.c482;

import javafx.fxml.FXML;

public class MainController extends Controller{

    public MainController() {
        super();
    }
    MainController(Inventory inventory) {
        super(inventory);
    }
    @FXML
    private void addProductSceneChange() {
        ProductController addProductController = new ProductController(inventory);
        Window addProduct = new Window("add-product.fxml", "Add-Product", addProductController);
        addProduct.showWindow();
    }
    @FXML
    private void changeProductSceneChange() {
        ProductController changeProductController = new ProductController(inventory);
        Window changeProduct = new Window("modify-product.fxml", "Change Product", changeProductController);
        changeProduct.showWindow();
    }
    @FXML
    private void addPartSceneChange() {
        PartController addPartController = new PartController(inventory);
        Window addPart = new Window("add-part.fxml", "Add-Part", addPartController);
        addPartController.setRadioButtons();
        addPart.showWindow();
    }
    @FXML
    private void changePartSceneChange() {
        PartController changePartController = new PartController(inventory);
        Window changePart = new Window("modify-part.fxml", "Alter Part", changePartController);
        changePart.showWindow();
    }
}
