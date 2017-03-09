import sys
import movieFormat
from report_gen import getOutputReport
if __name__ == '__main__':
    """
    The main method will be used to accept system arguments for movie details
    """

    # Getting the movie details and output report extension
    if len(sys.argv) < 7 :
        print ("Input should be of the form python interactionmain.py PulpFiction 1994 English SamuelJackson BlackComedy text")
    elif len(sys.argv) == 7 :
        movie_name = sys.argv[1] 	# Name of the movie
        run_time = sys.argv[2]	    # when was the movie released
        language = sys.argv[3]		# language of the movie
        lead_actor = sys.argv[4]	# Name of the lead actor in the movie
        genre = sys.argv[5]			# Genre of the movie
        export_method = sys.argv[6]	# extension of the output report
    # calling the movieformat module to parse the system arguments to the respective field
        movieFormat = movieFormat.my_Movie(movie_name, run_time, language, lead_actor, genre)
    #call getOutputreport to generate format specific Report from the given movie details
        getOutputReport(movieFormat, export_method)