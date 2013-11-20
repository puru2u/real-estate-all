package com.zawadz88.realestate.fragment;

import android.app.Activity;
import com.zawadz88.realestate.api.model.Section;

/**
 * Created: 04.11.13
 *
 * @author Zawada
 */
public class AbstractSectionFragment extends AbstractListFragment {
	public static final String SECTION_FRAGMENT_TAG = "sectionFragment";
	/**
	 * Fragment argument representing the section number for this fragment.
	 */
	public static final String ARG_SECTION = "section";

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if(activity instanceof SectionAttachedListener) {
			((SectionAttachedListener) activity).onSectionAttached((Section)getArguments().getSerializable(ARG_SECTION));
			getActivity().supportInvalidateOptionsMenu();//need to invalidate on activity's first start, because onCreateOptionsMenu(..) got executed before onSectionAttached(..)
		} else {
			throw new IllegalStateException("Activity must implement SectionAttachedListener!");
		}
	}

	public static interface SectionAttachedListener {
		void onSectionAttached(Section section);
	}

}
