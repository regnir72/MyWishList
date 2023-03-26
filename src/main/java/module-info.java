module com.gyp.mywishlist {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.gyp.mywishlist to javafx.fxml;
    exports com.gyp.mywishlist;
}
