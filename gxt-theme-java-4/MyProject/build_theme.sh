#!/bin/sh

# docs
#http://docs.sencha.com/gxt/4.x/ui/theme/GeneratingThemes.html

WORKINGDIR=`pwd`

# TODO path hard coded, must change
THEMER="/Users/branflake2267/workspace-sdk/gxt-sdk/gxt-4.0.1/themebuilder/bin/themer.sh"

$THEMER -gen "$WORKINGDIR/theme_generated/" \
-imageFile "$WORKINGDIR/theme_build/snapshot.png" \
-manifestFile "$WORKINGDIR/theme_build/snapshot.json" \
-out "$WORKINGDIR/theme_build/triton.jar" \
-imagePath "$WORKINGDIR/theme_files/icons" \
-warDir "$WORKINGDIR/war" \
-slicedDisabled "true" \
-sourcesOnly "true" \
-gwtXmlFilename "BaseTheme.gwt.xml" \
./theme_src/triton.theme

