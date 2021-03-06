package com.opportunity.hack.vidyodaya.services;

import com.opportunity.hack.vidyodaya.models.Camp;
import com.opportunity.hack.vidyodaya.models.Feedback;
import com.opportunity.hack.vidyodaya.models.Highlight;
import java.util.List;
import javax.persistence.EntityNotFoundException;

public interface CampService {
  /**
   * Return a list of all camps
   * @return List of all Camp instances
   */
  List<Camp> findAll();

  /**
   * Return the camp with the specified database id
   * @param id The database id requested
   * @return The Camp instance with the corresponding database id
   * @throws EntityNotFoundException Thrown when no camp with that id exists
   */
  Camp findCampById(long id) throws EntityNotFoundException;

  /**
   * Save the provided camp
   * @param camp The camp being saved
   * @return The finalized saved camp
   */
  Camp save(Camp camp);

  /**
   * Update the camp with the specified id using the partial Camp instance
   * provided
   * @param updateCamp A Partial Camp instance with new data
   * @param id The database id of the Camp instance to be updated
   */
  Camp update(Camp updateCamp, long id);

  /**
   * Delete the Camp instance with the specified database id
   * @param id The database id of the Camp instance to be deleted
   */
  void delete(long id);

  /**
   * Add a highlight to a camp
   * @param newHighlight Highlight instance to be added
   * @param campId Database id of Camp instance
   * @return new Highlight instance added
   */
  Highlight addHighlight(Highlight newHighlight, long campId);

  /**
   * Add a highlight to a camp
   * @param newFeedback Feedback instance to be added
   * @param campId Database id of Camp instance
   * @return new Feedback instance added
   */
  Feedback addFeedback(Feedback newFeedback, long campId);
}
