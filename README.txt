Notes for our developers:
-------------------------
Adding fossils:

1) Create a skeleton or slab class by copying and pasting in blocks -> skeleton or blocks -> slabs
If the fossil is NOT supposed to be able to dissolve into a DNA phial for a specific porganism,
then remove this Override method in full from the class:

    @Nullable
    @Override
    public String getDNACompat() etc.

2) Rename the mob name in that file, with both lower case and upper case starting letters

3) In block -> base - > BlockInit.java add the new block to the list in the same way shown

4) In client -> model add the new model by copying an existing one and pasting the BB code
(I have brought over all of the existing ones already changed to the correct formats)

5) In client -> render copy and paste a new slab or skeleton renderer as required.

6) Edit the renderer with the textures and stages needed

7) In client -> render -> RenderRegistryFossils.java add the new Block and Renderer

8) In tile copy and paste a new Tile entity and set the stages values for it

9) Add the language file entry in resources for the fossil

10) Add the json in resources for the item model (using skeleton or slab as the item graphic)

11) Add the fossil to the drops for the right period in FossilBlockDrops.java