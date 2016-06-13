# GXT Example
GXT Application using Java standard directory construction. This example theme includes Triton for GXT 4.0.1. 

## Reference

 *  http://docs.sencha.com/gxt/4.x/ui/theme/GeneratingThemes.html

## Running
0. Fix the build path or classpath for the project. 
1. Change the build_theme.sh theme builder directory. (Windows users refer to docs to make your own)
2. Build the theme first by running the build_theme.sh script.  
3. Debug in SDM
 
## Directories
* theme_src - appearance overrides are done here, check out what is in there.
* theme_files - the svg icons are used to generate the pngs are put here. 
* theme_generated - The generated theme files will be put here.
* theme_build - is used by the generator


## Changing the theme
1. Make a modification to the theme_src/triton.theme file.
2. Or make a change the appearances overrides in theme_src/com* files.
3. Run the theme builder script or launcher for it.
4. Refresh the app and see the change.  