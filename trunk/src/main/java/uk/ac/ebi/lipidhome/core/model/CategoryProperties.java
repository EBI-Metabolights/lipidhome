package uk.ac.ebi.lipidhome.core.model;

/**
 *
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 * @author Joe Foster <jfoster@ebi.ac.uk>
 *
 * Defines a model of the category_properties database table.
 *
 */
public class CategoryProperties extends LipidPropertiesObject {

    private Integer mainClasses;

    private Integer subClasses;

	private Integer species;

    private Integer faScanSpecies;

	private Integer subSpecies;

	private Integer annotatedIsomers;

    public Integer getMainClasses() {
        return mainClasses;
    }

    public void setMainClasses(Integer mainClasses) {
        this.mainClasses = mainClasses;
    }

    public Integer getSubClasses() {
        return subClasses;
    }

    public void setSubClasses(Integer subClasses) {
        this.subClasses = subClasses;
    }

    public Integer getSpecies() {
        return species;
    }

    public void setSpecies(Integer species) {
        this.species = species;
    }

    public Integer getFaScanSpecies() {
        return faScanSpecies;
    }

    public void setFaScanSpecies(Integer faScanSpecies) {
        this.faScanSpecies = faScanSpecies;
    }

    public Integer getSubSpecies() {
        return subSpecies;
    }

    public void setSubSpecies(Integer subSpecies) {
        this.subSpecies = subSpecies;
    }

    public Integer getAnnotatedIsomers() {
        return annotatedIsomers;
    }

    public void setAnnotatedIsomers(Integer annotatedIsomers) {
        this.annotatedIsomers = annotatedIsomers;
    }
}
