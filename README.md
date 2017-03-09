# anirudh
Movie Aggregator:

Part A: 

Create a console based application that accepts movie details like Name, Run Time, Language, Lead Actor and Genre and then export these details into one of the 2 formats, depending on user’s choice - “plain text” or “PDF”.

Part B: 

Make the application extensible so that it is easy to “plug in” a new format and the application automatically has the capability to export to the new format without making any changes to the application code.
Solution to the aforementioned problem:
The output to the problem can be realized with the help of four modules,
 
The Main module : which will interact with the user and store the details of the movie
The Movie Descriptor module : A class predefined to store the value of arguments passed by main as parameters for its constructor.
Report generator Module : A function to differentiate the type of export method and call the specific writer function from the writer module and doesnt depend on whichever be the export method.
Writer Module : A class of writers to Write input data to expected media type which can be extended for a any new format by adding new Writer methods in the module

For example if we wish our output to be in a CSV, XLS, zip, JSON, XML, HTML, Images, Hierarchical Data Format(HDF) or DOCX format we just have to write a function for the same and add it to the writer module. Voila!


    language used : Python
    used Tools : CMD.

    Part A
    1. To run the project, enter 'python interactionmain.py PulpFiction 1994 English SamuelJackson BlackComedy text'.
    2. to Write pdf or text, just specify the format as the last system argument, for eg python interactionmain.py TheHatefulEight  2015 English SamuelJackson crime pdf.
    3. Modules used are ReportLab

    Part B
    In case it is required to add a new type of format for exporting the data then we will have to write a function say "export_specific_formatWriter" and simply add it to the writer module under the class 

	
Note:
I have not put any checks on the input values, hence the user can enter alphabets in place of integers like in case of run_time.