
/**
 *
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 * @author Joe Foster <jfoster@ebi.ac.uk>
 *
 * @date August 2011
 *
 *
 * A Panel to hold information on cross references to various items in other resources.
 */
Ext.define('lph.browser.content.generic.CrossReferencesPanel', {
	/* Begin Definitions */
    extend		: 'Ext.form.Panel',
    
    title		: 'Xrefs',
    iconCls     : 'xref-16',
    border		: false,
    data		: null,
    border		: false,
	bodyPadding	: "20 50 0 20",
	width		: 400,
	layout		: 'anchor',
    disabled    : true,
	defaults	: {
		anchor		: '100%',
		labelWidth	: 130,
		readOnly	: true
	},
	defaultType	: 'textfield',
        
	loadRecord: function(data){
		var records = data.xrefs().getNewRecords(); 
    	Ext.each(records, function(ref){
    		var resource = ref.get("resource");
    		var url = ref.get("url");
    		this.add({
    			fieldLabel: resource,
    			value: url,
	        	name: resource
    		})
    	}, this);
    	this._updateTab(records.length);
	},
	
	_updateTab: function(num){
		this.setTitle(this.title + " (" + num + ")");
		if(num>0) this.enable();
	}
});