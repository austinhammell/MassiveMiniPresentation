package app;

public class Block {
    public static Block blockFactory(String blockType){
      Block myBlock = new Block();
      myBlock.setBlockType(blockType);
      return myBlock;
    }
    //A class is a user defined blueprint or prototype from which objects are created.
    //A class can have multiple properties that define the class.

    //A block from minecraft will have a block type as a property.
    private String blockType;

    //We need to be able to get the value of blockType after declaring a new instance of this class.
    public String getBlockType(){
        return blockType;
    }

    //We also want to be able to set the value of the blockType.
    public void setBlockType(String type){
        blockType = type;
    }

    //Constructors can allow you to require properties when creating a new instance of the class.
    // public Block(String type){
    //     blockType = type;
    // }
}
