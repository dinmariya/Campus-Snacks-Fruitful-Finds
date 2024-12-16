# Campus-Snacks-Fruitful-Finds
Campus Snacks and Fruitful Finds is an e-commerce system designed to bring the best snacks, pastry, drinks, and fruits to your campus.  Our app makes it easy to order and receive your favorite items. Browse menu, customize your order, and have it delivered right to you.

**#Guide on how to install and run the project.**

**1. Prepare Your Project**
Complete your Java application in NetBeans and ensure it's working correctly. 

Set the Main Class:
In your Java project's properties, there should be a setting for the "Main Class." This class is the entry point for your program, the one that gets executed when the software is launched. You need to specify the correct main class here.

Build your project into a JAR file:
In NetBeans, right-click your project in the Projects pane.
Select Clean and Build. The JAR file will be located in the dist folder of your project directory.

**2. Install and Open Install Creator Pro**
Download Install Creator Pro from the official website if you haven’t already installed it.
Launch the program after installation.

**3. Start a New Installer Project**
Click New Project in Install Creator Pro.
Follow the wizard to set up the installer.

**4. Add Your JAR File**
On the screen where you can add files, click Add Files.
Navigate to the dist folder in your NetBeans project directory.
Select the JAR file and click Open to include it in the installer.

**5. Set Icons for Your Application**
This step occurs during the setup of the project. You can customize the icons used in the installer and the executable:

Set Application Icon (for the Executable)
**Open the Project Settings:**
On the left-hand pane, click on the Project Settings tab or go to Project → Project Settings in the top menu.
**Set the Application Icon:**
Look for the Icon field in the General Settings section.
Click the Browse button (the small folder icon) next to the Icon field.
Navigate to the location where you have your icon file (preferably a .ico file).
Select the icon and click Open. This will be used for the installer and executable.
**Set Installer Interface Icons**
In the Project Settings window, under Appearance, you can set the icon for the installer interface:
Title Bar Icon: Click Browse next to Title Bar Icon and select the icon to display in the window title bar of the installer.
Welcome Icon: Click Browse next to Welcome Icon to select an icon for the welcome screen of the installer.
**Set Desktop Shortcut Icon**
Under the Shortcuts tab, find the option for Desktop Shortcut.
Click Browse next to the Icon field and select the .ico file you want to use for the desktop shortcut.
**Set Uninstaller Icon (Optional)**
In the Uninstaller section, click Browse to select an icon for the uninstaller.

**6. Configure Installation Options**
Set the Installation Path:
For example: C:\Program Files\YourAppName.
If you want the installer to create a desktop shortcut, configure it in the wizard.
Add any other files or dependencies your application requires.

**7. Build the Installer**
Once all configurations are complete, click Build Installer.
Save the project file and let Install Creator Pro generate the installer.

**8. Test the Installer**
Run the generated .exe installer to test the installation process.
Verify that the JAR file and other components are correctly installed.
Test that the desktop shortcut has the correct icon.
Check that the uninstaller shows the correct icon (if set).
Ensure that the license agreement screen appears (if you included one), and confirm that the user can accept the terms.

**Note on Icon Requirements:**

Image Format: The icon file must be in the .ico format. If you have an image in another format (such as .png, .jpg, or .bmp), you will need to convert it into an .ico format. You can use online tools like ConvertICO or software like GIMP or Adobe Photoshop to perform the conversion.

Icon Size: Icons should typically be 32x32 pixels for most applications, but you can also use 16x16 or 48x48 pixel sizes depending on your preference. Ensure that the icon is resized to an appropriate size (preferably 32x32 pixels) to display correctly in Windows.

Location: The icon file should be selected from the dist folder of your project directory, which is where the compiled JAR file and other deployment assets are located after you run Clean and Build in NetBeans. This ensures that the installer uses the correct icon associated with your application.
