
public enum SectionCategory {
	HISTORICAL, NEW, UNKNOWN;

	private static final int RECENT = 2000;

	public static SectionCategory getCategory(int year) {
		if (year < RECENT)
			return HISTORICAL;
		else
			return NEW;
	}
}
