package org.sitenv.referenceccda.validators.schema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ValidationObjectives {
	public static final List<String> ALL = new ArrayList<String>();
	public static final Set<String> ALL_UNIQUE = new HashSet<String>();
	public static final Set<String> ALL_UNIQUE_EXCEPT_DS4P = new HashSet<String>();
	public static final Set<String> ALL_UNIQUE_CONTENT_ONLY = new HashSet<String>();
	static {
		ALL.addAll(Sender.OBJECTIVES);
		ALL.addAll(Receiver.OBJECTIVES);
		
		ALL_UNIQUE.addAll(ALL);
		
		ALL_UNIQUE_CONTENT_ONLY.addAll(ALL_UNIQUE);
		ALL_UNIQUE_CONTENT_ONLY.removeAll(Arrays.asList(Sender.C_CDA_IG_ONLY, Sender.C_CDA_IG_PLUS_VOCAB));
		
		ALL_UNIQUE_EXCEPT_DS4P.addAll(ALL_UNIQUE);
		ALL_UNIQUE_EXCEPT_DS4P.removeAll(CCDATypes.DS4P_TYPES);
	}
	
	public static final List<String> CURRENTLY_PROCESSED_BY_CONTENT_VALIDATOR = new ArrayList<String>(Arrays.asList(
			Sender.B1_TOC_AMB_170_315, Sender.B1_TOC_INP_170_315, 
			Sender.B2_CIRI_AMB_170_315, Sender.B2_CIRI_INP_170_315,
			Sender.B4_CCDS_AMB_170_315, Sender.B4_CCDS_INP_170_315, 
			Sender.B6_DE_AMB_170_315, Sender.B6_DE_INP_170_315,
			Sender.B9_CP_AMB_170_315, Sender.B9_CP_INP_170_315, 
			Sender.E1_VDT_AMB_170_315, Sender.E1_VDT_INP_170_315,
			Sender.G9_APIACCESS_AMB_170_315, Sender.G9_APIACCESS_INP_170_315));

	public static class Sender {
		public static final String B1_TOC_AMB_170_315 = "170.315_b1_ToC_Amb";
		public static final String B1_TOC_INP_170_315 = "170.315_b1_ToC_Inp";
		public static final String B2_CIRI_AMB_170_315 = "170.315_b2_CIRI_Amb";
		public static final String B2_CIRI_INP_170_315 = "170.315_b2_CIRI_Inp";
		public static final String B4_CCDS_AMB_170_315 = "170.315_b4_CCDS_Amb";
		public static final String B4_CCDS_INP_170_315 = "170.315_b4_CCDS_Inp";
		public static final String B6_DE_AMB_170_315 = "170.315_b6_DE_Amb";
		public static final String B6_DE_INP_170_315 = "170.315_b6_DE_Inp";
		public static final String B7_DS4P_AMB_170_315 = "170.315_b7_DS4P_Amb";
		public static final String B7_DS4P_INP_170_315 = "170.315_b7_DS4P_Inp";
		public static final String B9_CP_AMB_170_315 = "170.315_b9_CP_Amb";
		public static final String B9_CP_INP_170_315 = "170.315_b9_CP_Inp";
		public static final String E1_VDT_AMB_170_315 = "170.315_e1_VDT_Amb";
		public static final String E1_VDT_INP_170_315 = "170.315_e1_VDT_Inp";
		public static final String G9_APIACCESS_AMB_170_315 = "170.315_g9_APIAccess_Amb";
		public static final String G9_APIACCESS_INP_170_315 = "170.315_g9_APIAccess_Inp";
		public static final String C_CDA_IG_ONLY = "C-CDA_IG_Only";
		public static final String C_CDA_IG_PLUS_VOCAB = "C-CDA_IG_Plus_Vocab";
		public static final String GOLD_SAMPLES_FOR_PRACTICE = "Gold_Samples_For_Practice";
		public static final List<String> OBJECTIVES = new ArrayList<String>(
				Arrays.asList(B1_TOC_AMB_170_315, B1_TOC_INP_170_315,
						B2_CIRI_AMB_170_315, B2_CIRI_INP_170_315,
						B4_CCDS_AMB_170_315, B4_CCDS_INP_170_315,
						B6_DE_AMB_170_315, B6_DE_INP_170_315,
						B7_DS4P_AMB_170_315, B7_DS4P_INP_170_315,
						B9_CP_AMB_170_315, B9_CP_INP_170_315,
						E1_VDT_AMB_170_315, E1_VDT_INP_170_315,
						G9_APIACCESS_AMB_170_315, G9_APIACCESS_INP_170_315,
						C_CDA_IG_ONLY, C_CDA_IG_PLUS_VOCAB,
						GOLD_SAMPLES_FOR_PRACTICE));
	}

	public static class Receiver {
		public static final String B1_TOC_AMB_170_315 = Sender.B1_TOC_AMB_170_315;
		public static final String B1_TOC_INP_170_315 = Sender.B1_TOC_INP_170_315;
		public static final String B2_CIRI_AMB_170_315 = Sender.B2_CIRI_AMB_170_315;
		public static final String B2_CIRI_INP_170_315 = Sender.B2_CIRI_INP_170_315;
		public static final String B5_CCDS_AMB_170_315 = "170.315_b5_CCDS_Amb";
		public static final String B5_CCDS_INP_170_315 = "170.315_b5_CCDS_Inp";
		public static final String B8_DS4P_AMB_170_315 = "170.315_b8_DS4P_Amb";
		public static final String B8_DS4P_INP_170_315 = "170.315_b8_DS4P_Inp";
		public static final String B9_CP_AMB_170_315 = Sender.B9_CP_AMB_170_315;
		public static final String B9_CP_INP_170_315 = Sender.B9_CP_INP_170_315;
		public static final String NEGATIVE_TESTING_CCDS = "NegativeTesting_CCDS";
		public static final String NEGATIVE_TESTING_CAREPLAN = "NegativeTesting_CarePlan";
		public static final List<String> OBJECTIVES = new ArrayList<String>(
				Arrays.asList(B1_TOC_AMB_170_315, B1_TOC_INP_170_315,
						B2_CIRI_AMB_170_315, B2_CIRI_INP_170_315,
						B5_CCDS_AMB_170_315, B5_CCDS_INP_170_315,
						B8_DS4P_AMB_170_315, B8_DS4P_INP_170_315,
						B9_CP_AMB_170_315, B9_CP_INP_170_315,
						NEGATIVE_TESTING_CCDS, NEGATIVE_TESTING_CAREPLAN));
	}

	public static String getObjectives() {
		StringBuffer sb = new StringBuffer();
		appendObjectivesData(Sender.OBJECTIVES, "SENDER", sb);
		sb.append(" ");
		appendObjectivesData(Receiver.OBJECTIVES, "RECEIVER", sb);
		return sb.toString();
	}
	
	protected static void appendObjectivesData(List<String> objectives, String parentClassName, StringBuffer sb) {
		sb.append(parentClassName + " options: ");
		for (int i = 0; i < objectives.size(); i++) {
			sb.append(objectives.get(i)
					+ (i == objectives.size() - 1 ? "" : ", "));
		}
	}

	public static void main(String[] args) {
		System.out.println("ValidationObjectives.getObjectives():" + System.lineSeparator() + "-" + ValidationObjectives.getObjectives());
		printObjectivesHelperForDebugging(ALL, "ALL");
		printObjectivesHelperForDebugging(ALL_UNIQUE, "ALL_UNIQUE");
		printObjectivesHelperForDebugging(ALL_UNIQUE_CONTENT_ONLY, "ALL_UNIQUE_CONTENT_ONLY");
		printObjectivesHelperForDebugging(CURRENTLY_PROCESSED_BY_CONTENT_VALIDATOR, "CURRENTLY_PROCESSED_BY_CONTENT_VALIDATOR");
	}
	
	private static void printObjectivesHelperForDebugging(Collection<String> collection, String description) {
		System.out.println(description + ":" + System.lineSeparator() + "-Size: " + collection.size() + System.lineSeparator()
				+ "-Content" + collection);
	}
}
