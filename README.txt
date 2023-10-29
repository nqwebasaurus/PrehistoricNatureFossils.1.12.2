Notes for our developers:
-------------------------
Adding fossils:

In java:
----------------
1) Create a skeleton or slab class by copying and pasting in blocks -> skeleton or blocks -> slabs
If the fossil is NOT supposed to be able to dissolve into a DNA phial for a specific organism,
then remove this Override method in full from the class:

    @Nullable
    @Override
    public String getDNACompat() etc.

2) Rename the mob name in that file, with both lower case and upper case starting letters, and
set the number of stages the fossil should be in.

3) Rename the advancement in that file. Create the trigger in triggers -> ModTriggers for it
(note that the string in capital letters is in two places in the ModTriggers file).

4) In block -> base - > BlockInit.java add the new block to the list in the same way shown

5) In client -> model add the new model by copying an existing one and pasting the BB code
(I have brought over all of the existing ones already changed to the correct formats)

6) In client -> render copy and paste a new slab or skeleton renderer as required.

7) Edit the renderer with the textures and stages needed

8) In client -> render -> RenderRegistryFossils.java add the new Block and Renderer

9) In tile copy and paste a new Tile entity with new name [no changes are needed to the copied file any more]

10) Add the fossil to the drops for the right period in FossilBlockDrops.java

In resources:
----------------
11) Copy an existing advancement and rename to the new advancement you made in 3)

12) Add the language file entry in resources for the fossil

13) Add the jsons for the item blockstate and model (using skeleton or slab as the item graphic)