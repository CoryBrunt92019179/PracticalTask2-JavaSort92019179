//package optimisedbubblesort;
package javasort;

/**
 *
 * @author 92019179
 */
class CatalogueItem implements Comparable {

    private Integer id;
    private String itemName;
    private String category;

    // getter methods
    public int getItemId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int compareTo(Object o) {
        CatalogueItem e = (CatalogueItem) o;
        return getItemName().compareTo(e.getItemName());
    }

    // constructor
    public CatalogueItem(Integer newId, String newName, String newCategory) {

        id = newId;
        itemName = newName;
        category = newCategory;
    }

}
