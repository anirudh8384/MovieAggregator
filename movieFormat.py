import uuid
class my_Movie(object):
    #This class is contructed to hold all the details of a movie
    def __init__(self, name, run_time, language, lead_actor, genre):
        self.id = str(uuid.uuid1())# generate id for the calling function so that movies can be referred to by their unique ID as well
        self.name = name
        self.run_time = run_time
        self.language = language
        self.lead_actor = lead_actor
        self.genre = genre